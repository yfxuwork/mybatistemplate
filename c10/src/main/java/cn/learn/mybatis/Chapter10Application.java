package cn.learn.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"cn.learn.mybatis.mapper","tk.mybatis.simple.mapper"})
public class Chapter10Application implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(Chapter10Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
	}
}
