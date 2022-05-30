package hospital.app.dao;

import java.util.List;

import hosptal.app.dto.MedOrder;

public interface MedOrderDao {
	public MedOrder saveMedOrder(MedOrder medOrder, int id);
	public MedOrder getMedOrderById(int id);
	public List<MedOrder> getMedOrderByEncounterId(int id);
	public List<MedOrder> getMedOrderByPersonId(int id);
	public MedOrder updateMedOrder(MedOrder medOrder);
	public MedOrder deleteMedOrderById(int id);

}
