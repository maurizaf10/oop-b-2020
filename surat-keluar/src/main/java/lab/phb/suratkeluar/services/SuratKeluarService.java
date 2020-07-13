package lab.phb.suratkeluar.services;

import lab.phb.suratkeluar.entity.SuratKeluar;
import lab.phb.suratkeluar.model.SuratKeluarModel;
import lab.phb.suratkeluar.repo.SuratKeluarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Service
public class SuratKeluarService {

    @Autowired
    private SuratKeluarRepo repo;

    public List<SuratKeluar> getAllData() {
        return repo.findAll();
    }

    public SuratKeluar convertToEntity(SuratKeluarModel model) {
        SuratKeluar result = new SuratKeluar();
        result.setNoSurat(model.getNoSurat());
        Calendar tanggal = Calendar.getInstance();
        tanggal.set(Calendar.YEAR, Integer.parseInt(model.getTanggalSurat().substring(0,4)));
        tanggal.set(Calendar.MONTH, Integer.parseInt(model.getTanggalSurat().substring(5,7))-1);
        tanggal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(model.getTanggalSurat().substring(8,10)));
        result.setTanggalSurat(tanggal.getTime());
        result.setPerihal(model.getPerihal());
        result.setTujuan(model.getTujuan());
        return result;
    }

    public SuratKeluar save(SuratKeluar surat) {
        return repo.save(surat);
    }

    public Optional<SuratKeluar> findById(String noSurat) {
        return repo.findById(noSurat);
    }

    public void removeById(String noSurat) {
        repo.deleteById(noSurat);
    }

}