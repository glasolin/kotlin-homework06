package ru.otus.cars

/**
 * Следит за машиной
 */
interface CarOutput {
    /**
     * Скажи текущую скорость
     */
    fun getCurrentSpeed(): Int
    fun getCurrentFuel(): Int
    fun getFuelType():FuelType
    fun getModel(): String
}