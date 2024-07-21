Dependency Inject (DI)
- Mô hình giảm sự phụ thuộc giữa các thành phần (hoặc lớp) trong ứng dụng.
- Không được tạo đối tượng bên trong đối tượng đó. Tiêm phụ thuộc thông qua 3 hình thức:
- Constructor, Injection, Setter

Tight-coupling: Ràng buộc chặt chẽ
Loose-coupling: Ràng buộc lỏng lẻo

Annotation
- Là cho phép bổ sung mã nguồn và cung cấp metadata cho các lớp, biến, gói
VD:
+ @Component => đánh dấu trên class để cho biết chúng là các bean
+ @Autowired => Được sử dụng để tiêm (inject) các dependency vào các thành phần khác

Ioc (Inversion of Control) luồng điều khiển không được diều khiển bởi ứng dụng mà được quyết định bởi framework hoặc container bên ngoài.
