package kodlamaio.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.UserService;
import kodlamaio.northwind.core.dataAccess.UserDao;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilites.results.DataResult;
import kodlamaio.northwind.core.utilites.results.Result;
import kodlamaio.northwind.core.utilites.results.SuccessDataResult;
import kodlamaio.northwind.core.utilites.results.SuccessResult;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kulanıcı eklendi. " );
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		this.userDao.findByEmail(email);
		return new SuccessDataResult<User>("Kulanıcı eklendi. " );
	}

}
