package lab.phb.suratkeluar.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "surat_keluar")
@Data
public class SuratKeluar {

    @Id @Column(name = "no_surat")
    private String noSurat;
    @Column(name = "tanggal_surat")
    private Date tanggalSurat;
    @Column(name = "perihal")
    private String perihal;
    @Column(name = "tujuan")
    private String tujuan;


}