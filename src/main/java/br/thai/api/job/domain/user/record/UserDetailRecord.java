package br.thai.api.job.domain.user.record;

import br.thai.api.job.domain.user.User;
import br.thai.api.job.domain.user.address.Address;

import java.util.List;

public record UserDetailRecord(Long id,
                               String name,
                               String cpf,
                               Address address,
                               List<String> phones) {
    public UserDetailRecord(User user){

    }
}
