package fiap.scj.oauth2github.controllers;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserInfoController {

  @GetMapping
  public String getUserInfo(Principal principal) {
    return ((OAuth2AuthenticationToken) principal).getPrincipal().getAttributes().toString();
  }

}
