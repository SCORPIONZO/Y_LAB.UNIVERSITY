package org.ylab.model;

import lombok.Setter;

import java.time.LocalDate;

public class WorkPlace {



   @Setter
   private int idWorkPlace;
   private boolean isOccupied;

   public WorkPlace(int idWorkPlace, boolean isOccupied) {
      this.idWorkPlace = idWorkPlace;
      this.isOccupied = isOccupied;
   }

   public int idWorkPlace() {
      return idWorkPlace;
   }

   public boolean isOccupied() {
      return isOccupied;
   }

   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("WorkPlace{");
      sb.append("idWorkPlace='").append(idWorkPlace).append('\'');
      sb.append(", isOccupied=").append(isOccupied);
      sb.append('}');
      return sb.toString();
   }

   public void setOccupied(boolean occupied) {
      isOccupied = occupied;
   }
}
