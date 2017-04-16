package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rates {

    @JsonProperty("AUD")
    private Double aUD;
    @JsonProperty("BGN")
    private Double bGN;
    @JsonProperty("BRL")
    private Double bRL;
    @JsonProperty("CAD")
    private Double cAD;
    @JsonProperty("CHF")
    private Double cHF;
    @JsonProperty("CNY")
    private Double cNY;
    @JsonProperty("CZK")
    private Double cZK;
    @JsonProperty("DKK")
    private Double dKK;
    @JsonProperty("GBP")
    private Double gBP;
    @JsonProperty("HKD")
    private Double hKD;
    @JsonProperty("HRK")
    private Double hRK;
    @JsonProperty("HUF")
    private Double hUF;
    @JsonProperty("IDR")
    private Double iDR;
    @JsonProperty("ILS")
    private Double iLS;
    @JsonProperty("INR")
    private Double iNR;
    @JsonProperty("JPY")
    private Double jPY;
    @JsonProperty("KRW")
    private Double kRW;
    @JsonProperty("MXN")
    private Double mXN;
    @JsonProperty("MYR")
    private Double mYR;
    @JsonProperty("NOK")
    private Double nOK;
    @JsonProperty("NZD")
    private Double nZD;
    @JsonProperty("PHP")
    private Double pHP;
    @JsonProperty("PLN")
    private Double pLN;
    @JsonProperty("RON")
    private Double rON;
    @JsonProperty("RUB")
    private Double rUB;
    @JsonProperty("SEK")
    private Double sEK;
    @JsonProperty("SGD")
    private Double sGD;
    @JsonProperty("THB")
    private Double tHB;
    @JsonProperty("TRY")
    private Double tRY;
    @JsonProperty("USD")
    private Double uSD;
    @JsonProperty("ZAR")
    private Double zAR;

    public Double getaUD() {
        return aUD;
    }

    public void setaUD(Double aUD) {
        this.aUD = aUD;
    }

    public Double getbGN() {
        return bGN;
    }

    public void setbGN(Double bGN) {
        this.bGN = bGN;
    }

    public Double getbRL() {
        return bRL;
    }

    public void setbRL(Double bRL) {
        this.bRL = bRL;
    }

    public Double getcAD() {
        return cAD;
    }

    public void setcAD(Double cAD) {
        this.cAD = cAD;
    }

    public Double getcHF() {
        return cHF;
    }

    public void setcHF(Double cHF) {
        this.cHF = cHF;
    }

    public Double getcNY() {
        return cNY;
    }

    public void setcNY(Double cNY) {
        this.cNY = cNY;
    }

    public Double getcZK() {
        return cZK;
    }

    public void setcZK(Double cZK) {
        this.cZK = cZK;
    }

    public Double getdKK() {
        return dKK;
    }

    public void setdKK(Double dKK) {
        this.dKK = dKK;
    }

    public Double getgBP() {
        return gBP;
    }

    public void setgBP(Double gBP) {
        this.gBP = gBP;
    }

    public Double gethKD() {
        return hKD;
    }

    public void sethKD(Double hKD) {
        this.hKD = hKD;
    }

    public Double gethRK() {
        return hRK;
    }

    public void sethRK(Double hRK) {
        this.hRK = hRK;
    }

    public Double gethUF() {
        return hUF;
    }

    public void sethUF(Double hUF) {
        this.hUF = hUF;
    }

    public Double getiDR() {
        return iDR;
    }

    public void setiDR(Double iDR) {
        this.iDR = iDR;
    }

    public Double getiLS() {
        return iLS;
    }

    public void setiLS(Double iLS) {
        this.iLS = iLS;
    }

    public Double getiNR() {
        return iNR;
    }

    public void setiNR(Double iNR) {
        this.iNR = iNR;
    }

    public Double getjPY() {
        return jPY;
    }

    public void setjPY(Double jPY) {
        this.jPY = jPY;
    }

    public Double getkRW() {
        return kRW;
    }

    public void setkRW(Double kRW) {
        this.kRW = kRW;
    }

    public Double getmXN() {
        return mXN;
    }

    public void setmXN(Double mXN) {
        this.mXN = mXN;
    }

    public Double getmYR() {
        return mYR;
    }

    public void setmYR(Double mYR) {
        this.mYR = mYR;
    }

    public Double getnOK() {
        return nOK;
    }

    public void setnOK(Double nOK) {
        this.nOK = nOK;
    }

    public Double getnZD() {
        return nZD;
    }

    public void setnZD(Double nZD) {
        this.nZD = nZD;
    }

    public Double getpHP() {
        return pHP;
    }

    public void setpHP(Double pHP) {
        this.pHP = pHP;
    }

    public Double getpLN() {
        return pLN;
    }

    public void setpLN(Double pLN) {
        this.pLN = pLN;
    }

    public Double getrON() {
        return rON;
    }

    public void setrON(Double rON) {
        this.rON = rON;
    }

    public Double getrUB() {
        return rUB;
    }

    public void setrUB(Double rUB) {
        this.rUB = rUB;
    }

    public Double getsEK() {
        return sEK;
    }

    public void setsEK(Double sEK) {
        this.sEK = sEK;
    }

    public Double getsGD() {
        return sGD;
    }

    public void setsGD(Double sGD) {
        this.sGD = sGD;
    }

    public Double gettHB() {
        return tHB;
    }

    public void settHB(Double tHB) {
        this.tHB = tHB;
    }

    public Double gettRY() {
        return tRY;
    }

    public void settRY(Double tRY) {
        this.tRY = tRY;
    }

    public Double getuSD() {
        return uSD;
    }

    public void setuSD(Double uSD) {
        this.uSD = uSD;
    }

    public Double getzAR() {
        return zAR;
    }

    public void setzAR(Double zAR) {
        this.zAR = zAR;
    }
}
