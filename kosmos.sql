-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema kosmos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema kosmos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `kosmos` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `kosmos` ;

-- -----------------------------------------------------
-- Table `kosmos`.`clínica`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `kosmos`.`clínica` (
  `consultorio` INT NOT NULL,
  `hora_cita` INT NOT NULL,
  `piso` INT NOT NULL,
  `id_clínica` BIGINT NOT NULL AUTO_INCREMENT,
  `apellido_materno_doctor` VARCHAR(120) NOT NULL,
  `apellido_paterno_doctor` VARCHAR(120) NOT NULL,
  `especialidad_doctor` VARCHAR(120) NOT NULL,
  `nombre_doctor` VARCHAR(120) NOT NULL,
  `nombre_paciente` VARCHAR(120) NOT NULL,
  PRIMARY KEY (`id_clínica`),
  UNIQUE INDEX `UKpiakwf7yf6no92ekcku1o0ih5` (`consultorio` ASC) VISIBLE,
  UNIQUE INDEX `UKqw453go2cr995qp9hyp29o9ao` (`hora_cita` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
