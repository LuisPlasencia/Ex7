package es.ulpgc.eite.da.orderingitems.data;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.UUID;

public class ItemData {


  // put the view state here
  public Long id;
  public String letter;
  public Integer position;

  public ItemData(String letter, Integer position) {
    id = generateUniqueId();
    this.letter = letter;
    this.position=position;
  }


  /**
   * Genereate unique ID from UUID in positive space
   * Reference: http://www.gregbugaj.com/?p=587
   *
   * @return long label representing UUID
   */
  private Long generateUniqueId() {
    long val = -1;

    do {

      final UUID uid = UUID.randomUUID();
      final ByteBuffer buffer = ByteBuffer.wrap(new byte[16]);
      buffer.putLong(uid.getLeastSignificantBits());
      buffer.putLong(uid.getMostSignificantBits());
      final BigInteger bi = new BigInteger(buffer.array());
      val = bi.longValue();
    }

    // We also make sure that the ID is in positive space,
    // if its not we simply repeat the process
    while (val < 0);
    return val;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ItemData)) return false;
    ItemData data = (ItemData) obj;
    return Objects.equals(id, data.id);
  }

  @Override
  public String toString() {
    return "{ letter: " + letter + ", position: " + position +  " }";
  }

}
