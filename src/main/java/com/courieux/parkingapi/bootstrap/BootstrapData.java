package com.courieux.parkingapi.bootstrap;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Component;

import com.courieux.parkingapi.entities.Fee;
import com.courieux.parkingapi.entities.Parking;
import com.courieux.parkingapi.repositories.ParkingRepository;

@Component
public class BootstrapData implements CommandLineRunner{

	private final ParkingRepository parkingRepository;
	
	public BootstrapData(ParkingRepository parkingRepository) {
		super();
		this.parkingRepository = parkingRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		System.out.println("Loading parking datas");
		
		Parking p = new Parking();
		p.setId(310L);
		p.setCapacity(1115);
		p.setFree(462);
		p.setStatus("OUVERT");
		p.setKey("Colombier");
		p.setGeo(new Point(48.10476252, -1.678624547));
		p.setSchedule("24h/24 et 7j/7. Bureau ouvert, 7h30 à 20h30 sauf dimanche et jours fériés.");
		p.setRecordTimestamp("2019-09-21T18:40:01.093000+00:00");
		Set<Fee> fees = new HashSet<>();
		fees.add(new Fee(15, 0.4));
		fees.add(new Fee(30, 0.8));
		fees.add(new Fee(60, 1.6));
		fees.add(new Fee(90, 2.2));
		fees.add(new Fee(120, 2.8));
		fees.add(new Fee(180, 4.0));
		fees.add(new Fee(240, 5.2));
		p.setFees(fees);
		parkingRepository.save(p);

		p = new Parking();
		p.setId(477L);
		p.setCapacity(964);
		p.setFree(608);
		p.setStatus("OUVERT");
		p.setKey("Gare-Sud");
		p.setGeo(new Point(48.1025360816, -1.672518275));
		p.setSchedule("24h/24 et 7j/7 Bureau ouvert : lundi et mardi, 5h30 à 22h. Mercredi, 5h30 à 23h. Jeudi et vendredi, 5h30 à minuit. Samedi, 7h à 22h. Dimanche et jours fériés, 8h à 1h.");
		p.setRecordTimestamp("2019-09-21T18:40:01.093000+00:00");
		fees = new HashSet<>();
		fees.add(new Fee(15, 0.5));
		fees.add(new Fee(30, 1.0));
		fees.add(new Fee(60, 2.0));
		fees.add(new Fee(90, 3.0));
		fees.add(new Fee(120, 4.0));
		fees.add(new Fee(180, 5.6));
		fees.add(new Fee(240, 7.2));
		p.setFees(fees);
		parkingRepository.save(p);
		
		System.out.println("Parkings Loaded : " + parkingRepository.count());
	}

}
