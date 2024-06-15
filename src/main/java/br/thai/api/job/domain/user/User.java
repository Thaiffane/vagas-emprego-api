package br.thai.api.job.domain.user;

import br.thai.api.job.domain.user.address.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    private Long id;
    private String name;
    private String cpf;
    private Address address;


}
