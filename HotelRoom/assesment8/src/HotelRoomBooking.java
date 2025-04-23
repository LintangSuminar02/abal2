public class HotelRoomBooking {
    private BookingInfo bookingInfo;

    public HotelRoomBooking(BookingInfo bookingInfo) {
        this.bookingInfo = bookingInfo;
    }

    public void cetakDetailPemesanan() {
        Customer c = bookingInfo.getCustomer();
        Room r = bookingInfo.getRoom();

        System.out.println("===== DETAIL PEMESANAN KAMAR =====");
        System.out.println("Nama Pemesan : " + c.getNama());
        System.out.println("Jenis Kelamin: " + c.getJenisKelamin());
        System.out.println("No. KTP      : " + c.getNomorKTP());
        System.out.println("Telepon      : " + c.getNomorTelepon());
        System.out.println("Email        : " + c.getEmail());
        System.out.println("Jenis Kamar  : " + r.getJenisKamar());
        System.out.println("Jumlah Tamu  : " + bookingInfo.getJumlahTamu());
        System.out.println("Jumlah Malam : " + bookingInfo.getJumlahMalam());
        System.out.println("Harga/Malam  : " + r.getHargaPerMalam());
        System.out.println("Check-in     : " + bookingInfo.getTanggalCheckin());
        System.out.println("Check-out    : " + bookingInfo.getTanggalCheckout());
        System.out.println("Status Aktif : " + bookingInfo.isStatusAktif());
        System.out.println("Voucher      : " + bookingInfo.getKodeVoucher());
        System.out.println("Sudah Dibayar: " + bookingInfo.isSudahDibayar());
        System.out.println("Total Biaya  : Rp " + bookingInfo.hitungTotalBiaya());
        System.out.println("Tipe Tamu    : " + bookingInfo.klasifikasiTamu());
        System.out.println("===================================");
    }
}
