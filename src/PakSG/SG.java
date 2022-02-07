/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PakSG;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author USER
 */
public class SG {
   int codigPos;
   String estado, municipio, colonia, calle;
   Date fechaCreacion;
   String tipoLampara;
   float potenciaW;
   Time horaEnce;
   Time horaApa;
   String img;
   int semaforo;
   Date fechaUlCen;
   String dms, dmm, dd;
   int vidaM;
   String eficaLum;

   public int getSemaforo() {
      return semaforo;
   }

   public void setSemaforo(int semaforo) {
      this.semaforo = semaforo;
   }
   
   

   public int getCodigPos() {
      return codigPos;
   }

   public void setCodigPos(int codigPos) {
      this.codigPos = codigPos;
   }

   public String getEstado() {
      return estado;
   }

   public void setEstado(String estado) {
      this.estado = estado;
   }

   public String getMunicipio() {
      return municipio;
   }

   public void setMunicipio(String municipio) {
      this.municipio = municipio;
   }

   public String getColonia() {
      return colonia;
   }

   public void setColonia(String colonia) {
      this.colonia = colonia;
   }

   public String getCalle() {
      return calle;
   }

   public void setCalle(String calle) {
      this.calle = calle;
   }

   public Date getFechaCreacion() {
      return fechaCreacion;
   }

   public void setFechaCreacion(Date fechaCreacion) {
      this.fechaCreacion = fechaCreacion;
   }

   public String getTipoLampara() {
      return tipoLampara;
   }

   public void setTipoLampara(String tipoLampara) {
      this.tipoLampara = tipoLampara;
   }

   public float getPotenciaW() {
      return potenciaW;
   }

   public void setPotenciaW(float potenciaW) {
      this.potenciaW = potenciaW;
   }

   public Time getHoraEnce() {
      return horaEnce;
   }

   public void setHoraEnce(Time horaEnce) {
      this.horaEnce = horaEnce;
   }

   public Time getHoraApa() {
      return horaApa;
   }

   public void setHoraApa(Time horaApa) {
      this.horaApa = horaApa;
   }

   public String getImg() {
      return img;
   }

   public void setImg(String img) {
      this.img = img;
   }

   public Date getFechaUlCen() {
      return fechaUlCen;
   }

   public void setFechaUlCen(Date fechaUlCen) {
      this.fechaUlCen = fechaUlCen;
   }

   public String getDms() {
      return dms;
   }

   public void setDms(String dms) {
      this.dms = dms;
   }

   public String getDmm() {
      return dmm;
   }

   public void setDmm(String dmm) {
      this.dmm = dmm;
   }

   public String getDd() {
      return dd;
   }

   public void setDd(String dd) {
      this.dd = dd;
   }

   public int getVidaM() {
      return vidaM;
   }

   public void setVidaM(int vidaM) {
      this.vidaM = vidaM;
   }

   public String getEficaLum() {
      return eficaLum;
   }

   public void setEficaLum(String eficaLum) {
      this.eficaLum = eficaLum;
   }
   
   
}
