package nl.pluralsight.stagepass.service;

import java.math.BigDecimal;

public record ConcertSummary(
        Long concertId,
        String concertTitle,
        int totalSeats,
        int seatsBooked,
        int availableSeats,
        BigDecimal totalRevenue
) {
}
