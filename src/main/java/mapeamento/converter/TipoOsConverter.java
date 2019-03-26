package mapeamento.converter;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import mapeamento.model.TipoOs;
 
@FacesConverter(forClass = TipoOs.class)
public class TipoOsConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (TipoOs) uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof TipoOs) {
            TipoOs entity= (TipoOs) value;
            if (entity != null && entity instanceof TipoOs && entity.getCdTipoOs() != null) {
                uiComponent.getAttributes().put( entity.getCdTipoOs().toString(), entity);
                return entity.getCdTipoOs().toString();
            }
        }
        return "";
    }
}