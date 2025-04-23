import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Setup data tanggal check-in dan check-out
        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.MAY, 1);
        Date checkin = cal.getTime();
        cal.set(2025, Calendar.MAY, 3);
        Date checkout = cal.getTime();

        // Buat objek Customer
        Customer customer = new Customer(
                "Dimas Aditya",
                "3201010203030001",
                "081234567890",
                "dimas@email.com",
                "Laki-laki"
        );

        // Buat objek Room
        Room room = new Room("Deluxe", 450000.0);

        // Buat objek BookingInfo
        BookingInfo booking = new BookingInfo(
                customer,
                room,
                3, // jumlah tamu
                2, // jumlah malam
                checkin,
                checkout,
                true, // status aktif
                "DISC50", // kode voucher
                true // sudah dibayar
        );

        // Buat objek HotelRoomBooking dan cetak detail pemesanan
        HotelRoomBooking hotelBooking = new HotelRoomBooking(booking);
        hotelBooking.cetakDetailPemesanan();
    }
}
