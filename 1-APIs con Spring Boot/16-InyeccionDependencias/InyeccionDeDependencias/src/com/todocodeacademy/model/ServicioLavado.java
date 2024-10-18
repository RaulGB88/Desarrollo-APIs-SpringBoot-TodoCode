package com.todocodeacademy.model;

public class ServicioLavado {
    
    private ServicioNormal serviNorm;
    private ServicioPremium serviPrem;
    
    //Inyectamos dependencia mediante constructor con parámetros
    public ServicioLavado(ServicioNormal serviNorm, ServicioPremium serviPrem) {
        this.serviNorm = serviNorm;
        this.serviPrem = serviPrem;
    }
    
    //Inyectamos dependenca mediante setters
    public void setServiNorm(ServicioNormal serviNorm) {
        this.serviNorm = serviNorm;
    }

    public void setServiPrem(ServicioPremium serviPrem) {
        this.serviPrem = serviPrem;
    }

   
    
    
    
}
