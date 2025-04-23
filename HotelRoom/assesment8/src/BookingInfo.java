import java.util.Date;

public class BookingInfo {
    private Customer customer;
    private Room room;
    private int jumlahTamu;
    private int jumlahMalam;
    private Date tanggalCheckin;
    private Date tanggalCheckout;
    private boolean statusAktif;
    private String kodeVoucher;
    private boolean sudahDibayar;

    public BookingInfo(Customer customer, Room room, int jumlahTamu, int jumlahMalam,
                       Date tanggalCheckin, Date tanggalCheckout, boolean statusAktif,
                       String kodeVoucher, boolean sudahDibayar) {
        this.customer = customer;
        this.room = room;
        this.jumlahTamu = jumlahTamu;
        this.jumlahMalam = jumlahMalam;
        this.tanggalCheckin = tanggalCheckin;
        this.tanggalCheckout = tanggalCheckout;
        this.statusAktif = statusAktif;
        this.kodeVoucher = kodeVoucher;
        this.sudahDibayar = sudahDibayar;
    }

    public double hitungTotalBiaya() {
        double total = room.getHargaPerMalam() * jumlahMalam;
        if (jumlahTamu > 2) {
            total += (jumlahTamu - 2) * 100000;
        }
        if (kodeVoucher != null && kodeVoucher.length() > 3) {
            total -= 50000;
        }
        if (!statusAktif) {
            total = 0;
        }
        return total;
    }

    public String klasifikasiTamu() {
        if (jumlahTamu == 1) return "Individu";
        else if (jumlahTamu == 2) return "Pasangan";
        else return "Keluarga";
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public int getJumlahTamu() {
        return jumlahTamu;
    }

    public int getJumlahMalam() {
        return jumlahMalam;
    }

    public Date getTanggalCheckin() {
        return tanggalCheckin;
    }

    public Date getTanggalCheckout() {
        return tanggalCheckout;
    }

    public boolean isStatusAktif() {
        return statusAktif;
    }

    public String getKodeVoucher() {
        return kodeVoucher;
    }

    public boolean isSudahDibayar() {
        return sudahDibayar;
    }
}
