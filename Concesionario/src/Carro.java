/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juancamilo
 */
public class Carro {
    private String codigo,modelo,marca,color,placa;
    private double precio;
    public Carro(String codigo,String modelo,String marca,String color,String placa,double precio) {
        this.codigo=codigo;
        this.modelo=modelo;
        this.marca=marca;
        this.color=color;
        this.placa=placa;
        this.precio=precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
        
  /*      public String estaVehi(){
         Iterator it = listaCarros.iterator();
        //int posicion=0,contador=0;
        String vehis="";
        for(int i=0;i<listaCarros.size();i++){
            Carro c = (Carro) it.next();
            if(c.getPrecio()>=precDesd && c.getPrecio()<=precDesd){
                vehis=codigo+" "+modelo+" "+marca;
            }                
        }
        return vehis;
    }*/
}

