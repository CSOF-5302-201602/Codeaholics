package com.losalpes.beans;

import com.losalpes.entities.Promocion;
import com.losalpes.servicios.IServicioCatalogoMockLocal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.jms.JMSException;
import org.primefaces.context.RequestContext;

@ManagedBean
@RequestScoped
public class PromocionBean {

    private Promocion promocion;

    @EJB
    private IServicioCatalogoMockLocal catologo;

    /**
     * Creates a new instance of PromocionBean
     */
    public PromocionBean() {

    }

    @PostConstruct
    public void init() {
        promocion = new Promocion();
    }

    public void AgregarPromocion() {
        try {
            catologo.AgregarPromocion(promocion);

            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Operación Exitosa", "Promocion Agregada");
            RequestContext.getCurrentInstance().showMessageInDialog(message);

        } catch (JMSException ex) {
            Logger.getLogger(PromocionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the promocion
     */
    public Promocion getPromocion() {
        return promocion;
    }

    /**
     * @param promocion the promocion to set
     */
    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

}
