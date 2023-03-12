package pl.pjatk.syljud;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class StationeryStorage {

        private Stationery stationery;
        private ArrayList<Stationery> stationeryArrayList = new ArrayList<>();

        public StationeryStorage(){
            stationeryArrayList.add(new Stationery(1,"SmallStickers",30,2.50));
            stationeryArrayList.add(new Stationery(2,"StickerSheets",12,5.70));

        }

        public ArrayList<Stationery> getStationeryArrayList() {
            return stationeryArrayList;
        }

        public Stationery findStationery(int id) {
            for(Stationery stationery: stationeryArrayList){
                if(stationery.getId() == id){
                    return stationery;
                }
            }
            return null;

        }

}
