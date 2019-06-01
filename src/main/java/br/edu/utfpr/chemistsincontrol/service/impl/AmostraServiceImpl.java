package br.edu.utfpr.chemistsincontrol.service.impl;

import br.edu.utfpr.chemistsincontrol.model.Amostra;
import br.edu.utfpr.chemistsincontrol.repository.AmostraRepository;
import br.edu.utfpr.chemistsincontrol.repository.IRepository;
import br.edu.utfpr.chemistsincontrol.service.AmostraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmostraServiceImpl extends CrudServiceImpl<Amostra> implements AmostraService {

    @Autowired
    private AmostraRepository repository;

    @Override
    protected IRepository<Amostra> getRepository() {
        return this.repository;
    }
}
