-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-12-2022 a las 00:31:00
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectofinalgrupo4`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bicicleta`
--

CREATE TABLE `bicicleta` (
  `num_serie` int(11) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `color` varchar(20) NOT NULL,
  `dueño` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `dni` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `domicilio` varchar(50) NOT NULL,
  `telefono` int(15) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `itemrespuesto`
--

CREATE TABLE `itemrespuesto` (
  `num_serie` int(11) NOT NULL,
  `id_reparacion` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `id_ItemRepuesto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reparación`
--

CREATE TABLE `reparación` (
  `id_reparacion` int(11) NOT NULL,
  `id_bicicleta` int(11) NOT NULL,
  `id_servicio` int(11) NOT NULL,
  `fechaEntrada` date NOT NULL,
  `precio` float NOT NULL,
  `etapa` tinyint(4) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repuesto`
--

CREATE TABLE `repuesto` (
  `num_serie` int(11) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `codigo` int(11) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `costo` float NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bicicleta`
--
ALTER TABLE `bicicleta`
  ADD PRIMARY KEY (`num_serie`),
  ADD KEY `dueño` (`dueño`),
  ADD KEY `num_serie` (`num_serie`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`dni`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `dni_2` (`dni`);

--
-- Indices de la tabla `itemrespuesto`
--
ALTER TABLE `itemrespuesto`
  ADD PRIMARY KEY (`id_ItemRepuesto`),
  ADD KEY `num_serie` (`num_serie`),
  ADD KEY `id_reparacion` (`id_reparacion`);

--
-- Indices de la tabla `reparación`
--
ALTER TABLE `reparación`
  ADD PRIMARY KEY (`id_reparacion`),
  ADD KEY `id_reparacion` (`id_reparacion`,`id_bicicleta`,`id_servicio`),
  ADD KEY `id_bicicleta` (`id_bicicleta`),
  ADD KEY `id_servicio` (`id_servicio`);

--
-- Indices de la tabla `repuesto`
--
ALTER TABLE `repuesto`
  ADD PRIMARY KEY (`num_serie`),
  ADD KEY `num_serie` (`num_serie`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `codigo` (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `itemrespuesto`
--
ALTER TABLE `itemrespuesto`
  MODIFY `id_ItemRepuesto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reparación`
--
ALTER TABLE `reparación`
  MODIFY `id_reparacion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bicicleta`
--
ALTER TABLE `bicicleta`
  ADD CONSTRAINT `bicicleta_ibfk_1` FOREIGN KEY (`dueño`) REFERENCES `cliente` (`dni`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `itemrespuesto`
--
ALTER TABLE `itemrespuesto`
  ADD CONSTRAINT `itemrespuesto_ibfk_1` FOREIGN KEY (`id_reparacion`) REFERENCES `reparación` (`id_reparacion`) ON UPDATE CASCADE,
  ADD CONSTRAINT `itemrespuesto_ibfk_2` FOREIGN KEY (`num_serie`) REFERENCES `repuesto` (`num_serie`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `reparación`
--
ALTER TABLE `reparación`
  ADD CONSTRAINT `reparación_ibfk_1` FOREIGN KEY (`id_bicicleta`) REFERENCES `bicicleta` (`num_serie`) ON UPDATE CASCADE,
  ADD CONSTRAINT `reparación_ibfk_2` FOREIGN KEY (`id_servicio`) REFERENCES `servicio` (`codigo`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
