package atm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ATMConfig {
    @Bean
    public DataSource dataSource() {
        return new DataSourceDB();
    }
    @Bean
    public Bank bank(DataSource dataSource) {
        return new Bank("My Bank", dataSource);
    }
    @Bean
    public ATM atm(Bank bank) {
        return new ATM(bank);
    }
    @Bean
    public AtmUI atmUI(ATM atm) {
        return new AtmUI(atm);
    }
}
