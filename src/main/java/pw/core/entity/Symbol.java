package pw.core.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SYMBOLS")
public class Symbol implements Serializable {

  @Id
  @GeneratedValue
  private Integer id;
  public int getId(){
	  return this.id;
  }
  public void setId(int id){
	  this.id = id;
  }

  private String symbol;
  private String name;
  private String lastSale;
  private String marketCap;
  private String ipoYear;
  private String sector;
  private String industry;
  private String summaryQuote;
  private String empty;
  
  public String getEmpty(){
    return this.empty.trim();
  }
  public void setEmpty(String empty){
    this.empty = empty;
  }
  
  
  public String getSummaryQuote(){
    return this.summaryQuote.trim();
  }
  public void setSummaryQuote(String summaryQuote){
    this.summaryQuote = summaryQuote;
  }
  
  public String getIndustry(){
    return this.industry.trim();
  }
  public void setIndustry(String industry){
    this.industry = industry;
  }
  
  public String getSector(){
    return this.sector.trim();
  }
  public void setSector(String sector){
    this.sector = sector;
  }
  
  public String getIpoYear(){
    return this.ipoYear.trim();
  }
  public void setIpoYear(String ipoYear){
    this.ipoYear = ipoYear;
  }
  
  public String getMarketCap(){
    return this.marketCap.trim();
  }
  public void setMarketCap(String marketCap){
    this.marketCap = marketCap;
  }
  
  public String getLastSale(){
    return this.lastSale.trim();
  }
  public void setLastSale(String lastSale){
    this.lastSale = lastSale;
  }
  
  public String getName(){
    return this.name.trim();
  }
  public void setName(String name){
    this.name = name;
  }
  
  public String getSymbol(){
    return this.symbol.trim();
  }
  public void setSymbol(String symbol){
    this.symbol = symbol;
  }
}
