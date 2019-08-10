package com.flight.ticketsAnalysis.entity;
import java.math.BigDecimal;

public class AirportEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3472263398389713706L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** airportId */
    private Integer airport_id;

    /** airportName */
    private String airport_name;

    /** cityName */
    private String city_name;

    /** province */
    private String province;

    /** airportX */
    private BigDecimal airport_x;

    /** airportY */
    private BigDecimal airport_y;

    public Integer getAirport_id() {
        return airport_id;
    }

    public void setAirport_id(Integer airport_id) {
        this.airport_id = airport_id;
    }

    public String getAirport_name() {
        return airport_name;
    }

    public void setAirport_name(String airport_name) {
        this.airport_name = airport_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public BigDecimal getAirport_x() {
        return airport_x;
    }

    public void setAirport_x(BigDecimal airport_x) {
        this.airport_x = airport_x;
    }

    public BigDecimal getAirport_y() {
        return airport_y;
    }

    public void setAirport_y(BigDecimal airport_y) {
        this.airport_y = airport_y;
    }
}