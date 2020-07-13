package lab.phb.suratkeluar.repo;

import lab.phb.suratkeluar.entity.SuratKeluar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuratKeluarRepo extends JpaRepository<SuratKeluar, String> {
}