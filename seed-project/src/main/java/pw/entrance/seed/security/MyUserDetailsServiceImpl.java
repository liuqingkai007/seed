package pw.entrance.seed.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import pw.entrance.seed.dao.UsersDao;
import pw.entrance.seed.domain.Resources;
import pw.entrance.seed.domain.Roles;
import pw.entrance.seed.domain.Users;

public class MyUserDetailsServiceImpl implements UserDetailsService {

	private UsersDao usersDao;

	public UsersDao getUsersDao() {
		return usersDao;
	}

	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		System.out.println("username is " + username);
		Users users = this.usersDao.findByName(username);
		if (users == null) {
			throw new UsernameNotFoundException(username);
		}
		Collection<GrantedAuthority> grantedAuths = obtionGrantedAuthorities(users);

		boolean enables = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;

		User userdetail = new User(users.getAccount(), users.getPassword(),
				enables, accountNonExpired, credentialsNonExpired,
				accountNonLocked, grantedAuths);
		return userdetail;
	}

	// 取得用户的权限
	private Set<GrantedAuthority> obtionGrantedAuthorities(Users user) {
		Set<GrantedAuthority> authSet = new HashSet<GrantedAuthority>();
		Set<Roles> roles = user.getRoles();

		for (Roles role : roles) {
			Set<Resources> tempRes = role.getResources();
			for (Resources res : tempRes) {
				authSet.add(new SimpleGrantedAuthority(res.getName()));
			}
		}
		return authSet;
	}

}
