package hospital.app.dao;

import hosptal.app.dto.Address;

public interface AddressDao {
	public Address saveAddress(Address address, int id);
	public Address getBranchAddressById(int id);
	public Address updateAddress(Address address, int id);
	public boolean deleteAddress(int id);

}
