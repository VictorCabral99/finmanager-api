package br.com.finmanager;

import br.com.finmanager.models.Category;
import br.com.finmanager.models.Configuration;
import br.com.finmanager.models.Registry;
import br.com.finmanager.repositories.CategoryRepository;
import br.com.finmanager.repositories.ConfigurationRepository;
import br.com.finmanager.repositories.RegistryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinmanagerApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ConfigurationRepository configurationRepository;
	@Autowired
	private RegistryRepository registryRepository;

	public static void main(String[] args) {
		SpringApplication.run(FinmanagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category1 = Category.builder().id(1L).build();

		categoryRepository.saveAndFlush(category1);
		configurationRepository.saveAndFlush(Configuration.builder().email("victor").build());
		registryRepository.saveAndFlush(Registry.builder().id(1L).category(category1).build());
	}
}
