package lab.phb.suratkeluar.controller;

import lab.phb.suratkeluar.entity.SuratKeluar;
import lab.phb.suratkeluar.model.SuratKeluarModel;
import lab.phb.suratkeluar.services.SuratKeluarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class WebController {

    @Autowired
    private SuratKeluarService service;

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("surat", service.getAllData());
        return "index";
    }

    @GetMapping("/tambah")
    public String tampilkanTambahForm(Model model) {
        model.addAttribute("surat", new SuratKeluarModel());
        return "tambah-surat";
    }

    @PostMapping("/simpan")
    public String simpan(SuratKeluarModel surat) {
        service.save(service.convertToEntity(surat));
        return "redirect:/";
    }

    @GetMapping("/ubah/{noSurat}")
    public String ubah(@PathVariable("noSurat") String noSurat, Model model) {
        Optional<SuratKeluar> result = service.findById(noSurat);
        if(result.isPresent()) {
            SuratKeluar data = result.get();
            model.addAttribute("surat", data);
            return "edit-surat";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/hapus/{noSurat}")
    public String hapus(@PathVariable("noSurat") String noSurat) {
        service.removeById(noSurat);
        return "redirect:/";
    }

}