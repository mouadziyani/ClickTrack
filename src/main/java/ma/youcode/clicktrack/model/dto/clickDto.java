package ma.youcode.clicktrack.model.dto;

public class clickDto {
    private String urlDirections;
    private String publisher;
    private String offre;
    private Long click ;

    public clickDto() {
    }
    
    public clickDto(String urlDirections, String publisher, String offre, Long click) {
        this.urlDirections = urlDirections;
        this.publisher = publisher;
        this.offre = offre;
        this.click = click;
    }
    public String getUrlDirections() {
        return urlDirections;
    }
    public void setUrlDirections(String urlDirections) {
        this.urlDirections = urlDirections;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getOffre() {
        return offre;
    }
    public void setOffre(String offre) {
        this.offre = offre;
    }
    public Long getClick() {
        return click;
    }
    public void setClick(Long click) {
        this.click = click;
    }
}
