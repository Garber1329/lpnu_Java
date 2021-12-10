package com.example.bakeryProject.security;

import com.example.bakeryProject.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
public class MyUserDetails extends User implements UserDetails {
    private User user;
    String ROLE_PREFIX = "ROLE_";

    public MyUserDetails(final User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        final List<GrantedAuthority> list = new ArrayList<GrantedAuthority> ();
        list.add(new SimpleGrantedAuthority (ROLE_PREFIX + user.getRole()));
        return list;
    }

    @Override
    public String getUsername() {
        return user.getUsername ();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
