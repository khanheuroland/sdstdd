package samsungtdd.builderlombok;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SDSUser {
    private int Id;
    private String userName;
    private String password;
}
