package atm;

import java.io.IOException;
import java.util.Map;

/*
    Layer of Indirection
    Seam เราไม่ควรแทรก interface เข้าไป ส่วนที่เปลี่ยนบ่อย ให้ใส่ Seam เข้าไป
    Seam มักจะแทรกส่วนที่ต่อ UI กับ ส่วนที่ต่อ infrastructure (database)
 */

public interface IDataSource {
    public Map<Integer, Customer> readCustomers()  throws IOException;
}
