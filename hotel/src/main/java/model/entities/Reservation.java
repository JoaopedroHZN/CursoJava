package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//Tradutor de Datas

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkout, Date checkin) {
        this.roomNumber = roomNumber;
        this.checkout = checkout;
        this.checkin = checkin;
    }

    public Date getCheckin() {
        return checkin;
    }


    public Date getCheckout() {
        return checkout;
    }


    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public long duration(){
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);//Vai Converter esse MILISECONDS PARA DAYS
    }

    public void updateDates(Date checkin, Date checkout){
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return
                "roomNumber=" + roomNumber +
                ", checkin=" + sdf.format(checkin) +
                ", checkout=" + sdf.format(checkout) + "," + duration() + "nigths" +
                '}';
    }
}
