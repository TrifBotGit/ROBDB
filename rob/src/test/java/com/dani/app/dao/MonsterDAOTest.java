package com.dani.app.dao;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.dani.app.model.Monster;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MonsterDAOTest {

	@Autowired
	MonsterDAO dao;
	
	@Test
	@Sql(statements="INSERT INTO MONSTER VALUES(1, 'Lagiacrus', 'Leviathan', 'Limping')")
	public void testGetByName(){
		Monster monster = dao.getByName("Lagiacrus");
		assertThat(monster.getName()).isEqualTo("Lagiacrus");
	}
}
