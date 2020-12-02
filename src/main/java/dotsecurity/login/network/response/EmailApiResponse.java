package dotsecurity.login.network.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EmailApiResponse {

    private boolean check;
    private String message;
}
