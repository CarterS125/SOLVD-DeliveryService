package com.solvd.deliveryservice.JSON;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeliveryServiceParser {
    private static ObjectMapper mapper = new ObjectMapper();

    public static DeliveryServiceParser parseDelivery(String json) {
        try {
            return mapper.readValue(json, DeliveryServiceParser.class);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Could not parse JSON: " + json, e);
        }
    }

    public static String toJson(DeliveryServiceParser delivery) {
        try {
            return mapper.writeValueAsString(delivery);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Could not generate JSON: " + delivery, e);
        }
    }
    @JsonProperty("deliveryId")
    private String deliveryId;

    @JsonProperty("deliveryAddress")
    private String deliveryAddress;

    @JsonProperty("deliveryCity")
    private String deliveryCity;

    @JsonProperty("deliveryPostalCode")
    private String deliveryPostalCode;

    @JsonProperty("deliveryCountry")
    private String deliveryCountry;

    public void Delivery() {}

    public void Delivery(String deliveryId, String deliveryAddress, String deliveryCity, String deliveryPostalCode, String deliveryCountry) {
        this.deliveryId = deliveryId;
        this.deliveryAddress = deliveryAddress;
        this.deliveryCity = deliveryCity;
        this.deliveryPostalCode = deliveryPostalCode;
        this.deliveryCountry = deliveryCountry;
    }

    public static void main(String[] args) {
        DeliveryServiceParser delivery = new DeliveryServiceParser();
        delivery.setDeliveryId("DELIVERY_001");
        delivery.setDeliveryAddress("123 Main St");
        delivery.setDeliveryCity("New York");
        delivery.setDeliveryPostalCode("10001");
        delivery.setDeliveryCountry("USA");

        String json = toJson(delivery);
        System.out.println("Delivery as JSON: " + json);

        DeliveryServiceParser deliveryFromJson = parseDelivery(json);
        System.out.println("Delivery from JSON: " + deliveryFromJson);
    }


    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public String getDeliveryPostalCode() {
        return deliveryPostalCode;
    }

    public void setDeliveryPostalCode(String deliveryPostalCode) {
        this.deliveryPostalCode = deliveryPostalCode;
    }

    public String getDeliveryCountry() {
        return deliveryCountry;
    }

    public void setDeliveryCountry(String deliveryCountry) {
        this.deliveryCountry = deliveryCountry;
    }
}
