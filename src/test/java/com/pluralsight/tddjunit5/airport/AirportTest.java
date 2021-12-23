package com.pluralsight.tddjunit5.airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {
/*

    @Test
    public void testAirport() {

        Flight economyFlight = new EconomyFlight("1");
        Flight businessFlight = new BusinessFlight("2");

        Passenger john = new Passenger("John", true);
        Passenger mike = new Passenger("Mike", false);

        assertEquals(true, economyFlight.addPassenger(john));
        assertEquals(false, economyFlight.removePassenger(john));
        assertEquals(true, businessFlight.addPassenger(john));
        assertEquals(false, businessFlight.removePassenger(john));


        assertEquals(true, economyFlight.addPassenger(mike));
        assertEquals(true, economyFlight.removePassenger(mike));
        assertEquals(false, businessFlight.addPassenger(mike));
        assertEquals(false, businessFlight.removePassenger(mike));

    }
 */

    @Test
    public void testEconomyFlightUsualPassenger() {
        Flight economyFlight = new EconomyFlight("1");
        Passenger mike = new Passenger("Mike", false);

        assertEquals("1", economyFlight.getId());
//        assertEquals(true, economyFlight.addPassenger(mike));
        assertTrue(economyFlight.addPassenger(mike));
        assertEquals(1, economyFlight.passengersList.size());
        assertEquals("Mike", economyFlight.getPassengersList().get(0).getName());
//        assertEquals(true, economyFlight.removePassenger(mike));
        assertTrue(economyFlight.removePassenger(mike));
        assertEquals(0, economyFlight.passengersList.size());

    }

    @Test
    public void testEconomyFlightVipPassenger() {
        Flight economyFlight = new EconomyFlight("1");
        Passenger john = new Passenger("John", true);

        assertEquals("1", economyFlight.getId());
//        assertEquals(true, economyFlight.addPassenger(mike));
        assertTrue(economyFlight.addPassenger(john));
        assertEquals(1, economyFlight.passengersList.size());
        assertEquals("John", economyFlight.getPassengersList().get(0).getName());
//        assertEquals(false, economyFlight.removePassenger(john));
        assertFalse(economyFlight.removePassenger(john));
        assertEquals(1, economyFlight.passengersList.size());

    }


    @Test
    public void testBusinessFlightUsualPassenger() {
        Flight businessFlight = new BusinessFlight("2");

        Passenger mike = new Passenger("Mike", false);

        assertEquals(false, businessFlight.addPassenger(mike));
        assertEquals(0, businessFlight.getPassengersList().size());
        assertEquals(false, businessFlight.removePassenger(mike));
        assertEquals(0, businessFlight.getPassengersList().size());

    }

    @Test
    public void testBusinessFlightVipPassenger() {
        Flight businessFlight = new BusinessFlight("2");

        Passenger john = new Passenger("John", true);

        assertEquals(true, businessFlight.addPassenger(john));
        assertEquals(1, businessFlight.getPassengersList().size());
        assertEquals(false, businessFlight.removePassenger(john));
        assertEquals(1, businessFlight.getPassengersList().size());

    }

}