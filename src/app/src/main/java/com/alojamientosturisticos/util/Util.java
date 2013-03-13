/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alojamientosturisticos.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.apache.log4j.Logger;

import com.alojamientosturisticos.domain.Configuracion;
import com.alojamientosturisticos.domain.TipoTarifa;

/**
 *
 * @author carlosalvite
 */
public class Util {
    
    private static Logger logger = Logger.getLogger(Util.class);
    
    public static Date stringToDate(String fechaString)
    {
        DateFormat formatter; 
        Date date; 
        formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = (Date)formatter.parse(fechaString);  
            return date;

        } catch (ParseException ex) {
            logger.debug("Error parseando fecha " + ex);
        }

        return null;
    }
    
    public static String formatSpanishToEnglish(String _fecha)
    {
        Calendar fecha = new GregorianCalendar();
        fecha.setTime(Util.stringToDate(_fecha));
        Integer dia = fecha.get(fecha.DATE);
        Integer mes = fecha.get(fecha.MONTH)+1;
        Integer ano = fecha.get(fecha.YEAR);
        
        return mes.toString()+ "/" +dia.toString() + "/" + ano.toString();
    }
    
    public static Date getFechaActualSinHora()
    {
        Date fechaActual = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime( fechaActual );
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date fechaActualModificada = calendar.getTime();
        
        return fechaActualModificada;
    }
    
    /*
     * Retorna el numero de dias entre dos fechas
     */
    public static Integer getNumeroDiasEntreFechas(Date a, Date b)
    {
        int tempDifference = 0;
        int difference = 0;
        Calendar earlier = Calendar.getInstance();
        Calendar later = Calendar.getInstance();

        if (a.compareTo(b) < 0)
        {
            earlier.setTime(a);
            later.setTime(b);
        }
        else
        {
            earlier.setTime(b);
            later.setTime(a);
        }

        while (earlier.get(Calendar.YEAR) != later.get(Calendar.YEAR))
        {
            tempDifference = 365 * (later.get(Calendar.YEAR) - earlier.get(Calendar.YEAR));
            difference += tempDifference;

            earlier.add(Calendar.DAY_OF_YEAR, tempDifference);
        }

        if (earlier.get(Calendar.DAY_OF_YEAR) != later.get(Calendar.DAY_OF_YEAR))
        {
            tempDifference = later.get(Calendar.DAY_OF_YEAR) - earlier.get(Calendar.DAY_OF_YEAR);
            difference += tempDifference;

            earlier.add(Calendar.DAY_OF_YEAR, tempDifference);
        }

        return difference;
    }
    
    /**
     * Calcula la tarifa total en funcion al tipo de tarifa, el monto de la tarifa, la cantidad de noches y la cantidad de personas
     * @param tipoTarifaId
     * @param tarifaStr
     * @param noches
     * @param personas
     * @return
     */
    public static Double tarifaTotal(
    		Long tipoTarifaId,
            Double tarifa,
            Integer noches,
            Integer personas){
    	
    	//Tarifa total del hospedaje
    	Double tarifaTotal = new Double(0);
    	
    	//Buscamos el tipo de tarifa
    	TipoTarifa elTipoDeTarifa = TipoTarifa.findTipoTarifa(tipoTarifaId); 
    	
    	//Tipo de tarifa: Paquete Completo
    	if (elTipoDeTarifa.getNombre().compareTo("Paquete completo")==0){
    		tarifaTotal = tarifa;
    	}
    	
    	//Tipo de tarifa: Precio por habitacion por noche
    	if (elTipoDeTarifa.getNombre().compareTo("Precio por habitacion por noche")==0){
    		tarifaTotal = tarifa*noches;
    	}
    	
    	//Tipo de tarifa: Precio por persona por noche
    	if (elTipoDeTarifa.getNombre().compareTo("Precio por persona por noche")==0){
    		tarifaTotal = tarifa*noches*personas;
    	}
    	
    	return tarifaTotal;
    }
    
    /**
     * Calcula la comision de www.aquedarse.com en funcion a la tarifa total
     * @param tarifaTotal
     * @return
     */
    public static Double comision( Double tarifaTotal ){
    	
    	//TODO: segun se decida, implementar o no, mecanismo de comision variable
    	Double porcentajeComisionAquedarse = Double.parseDouble(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.porcentajeComisionFijoAquedarseSobreTarifa").getSingleResult()).getValor());
    	
    	Double comisionTotalAquedarse = tarifaTotal*porcentajeComisionAquedarse/100;
    	
    	return comisionTotalAquedarse;
    }
    /**
     * Calcula el pvp en funcion a la tarifa total y a la comision de aquedarse.com
     * @param tarifaTotal
     * @param comisionTotalAquedarse
     * @return
     */
    public static Double pvp(Double tarifaTotal, Double comisionTotalAquedarse){
    	
    	Double pvp = tarifaTotal + comisionTotalAquedarse;
    	
    	return pvp;
    }
    
    /**
     * Calcula los cargos totales por el uso de la plataforma de pagos electronicos y costos por transferir el pago al hospedaje. 
     * @param tarifaTotal
     * @return
     */
    public static Double comisionPlataforma(Double tarifaTotal){
    	
    	//Comision fija plataforma de pago
    	Double comisionFijaPlataformaPago = Double.parseDouble(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.montoComisionFijaPlataformaPago").getSingleResult()).getValor());
    	
    	//Comision variable plataforma de pago
    	Double comisionVariablePlataformaPago = Double.parseDouble(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.porcentajeComisionVariablePlataformaPago").getSingleResult()).getValor());
    	
    	//Comision fija transferencia de pago
    	Double comisionFijaPorTransferencia = Double.parseDouble(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.montoComisionFijaPorTransferenciaBancaria").getSingleResult()).getValor());

    	Double comisionTotalPagoElectronico = comisionFijaPlataformaPago + comisionFijaPorTransferencia + tarifaTotal*comisionVariablePlataformaPago/100;
    	
    	return comisionTotalPagoElectronico;
    }
    
    /**
     * Calcula el pago total a recibir el alojamiento
     * @param tarifaTotal
     * @param comisionTotalPagoElectronico
     * @return
     */
    public static Double pagoAlojamiento(Double tarifaTotal, Double comisionTotalPagoElectronico){
    	
    	Double pagoAlojamiento = tarifaTotal - comisionTotalPagoElectronico;
    	
    	return pagoAlojamiento;
    }
}
