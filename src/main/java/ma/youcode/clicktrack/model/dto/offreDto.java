package ma.youcode.clicktrack.model.dto;

public class offreDto {
    private String offre;
    private long click;
    private long linksN;

    public offreDto(String offre, long click, long linksN) {
        this.offre = offre;
        this.click = click;
        this.linksN = linksN;
    }
    
    public String getOffre() {
        return offre;
    }
    public void setOffre(String offre) {
        this.offre = offre;
    }
    public long getClick() {
        return click;
    }
    public void setClick(long click) {
        this.click = click;
    }
    public long getLinksN() {
        return linksN;
    }
    public void setLinksN(long linksN) {
        this.linksN = linksN;
    }
}
