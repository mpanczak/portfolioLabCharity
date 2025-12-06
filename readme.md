# Charity Donation Application

A Spring Boot web application for managing charity donations. Users can donate items to various institutions, track donation statistics, and schedule pickup times.

## Technologies Used

- **Java 16**
- **Spring Boot 2.6.2**
- **Spring Data JPA**
- **MySQL Database**
- **JSP (JavaServer Pages)** for views
- **Lombok** for reducing boilerplate code
- **Maven** for dependency management

## Features

- View donation statistics (total bags and donations)
- Browse available charity institutions
- Create donations with:
  - Multiple categories
  - Quantity of bags
  - Institution selection
  - Pickup address
  - Pickup date and time
  - Additional comments
- Confirmation page after donation submission

## Project Structure

```
src/main/java/pl/coderslab/charity/
├── CharityApplication.java          # Main Spring Boot application
├── controller/                      # MVC Controllers
│   ├── HomeController.java         # Home page with statistics
│   ├── DonationController.java     # Donation form handling
│   └── ConfirmationController.java # Donation confirmation
├── entity/                          # JPA Entities
│   ├── Category.java               # Donation categories
│   ├── Donation.java               # Donation entity
│   └── Institution.java            # Charity institutions
├── repository/                     # Spring Data JPA Repositories
│   ├── CategoryRepository.java
│   ├── DonationRepository.java
│   └── InstitutionRepository.java
└── service/                         # Business logic layer
    ├── CategoryService.java
    ├── DonationService.java
    └── InstitutionService.java
```

## Setup Instructions

### Prerequisites

- Java 16 or higher
- Maven 3.6+
- MySQL 5.7+ or MySQL 8.0+

### Database Configuration

1. Create a MySQL database:
```sql
CREATE DATABASE `charity-donation`;
```

2. Update database credentials in `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/charity-donation?serverTimezone=UTC
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Running the Application

1. Clone the repository:
```bash
git clone <repository-url>
cd portfolioLabCharity
```

2. Build the project:
```bash
mvn clean install
```

3. Run the application:
```bash
mvn spring-boot:run
```

4. Open your browser and navigate to:
```
http://localhost:8080
```

## Configuration

The application uses the following key configurations:

- **Database**: MySQL with Hibernate auto-create mode (change to `update` for production)
- **View Engine**: JSP with prefix `/WEB-INF/views/` and suffix `.jsp`
- **Locale**: Polish (pl_PL) by default
- **Initial Data**: Check `src/main/resources/import.sql` for initial data seeding

## Development Notes

- The application uses `spring.jpa.hibernate.ddl-auto=create` which will recreate the database schema on each startup. Change to `update` for production use.
- Initial data can be loaded via `import.sql` file in the resources directory.
- The application includes internationalization support with Polish language messages.

## License

This project was created with love in CodersLab.
