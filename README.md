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

Bean 
- Là một đối tượng được quản lý và được tạo bởi IOC container
(*) Cách dùng Bean
1. Dùng @Component: @Respository, @Service, @Controller
2. Dùng @Bean trong class có Annotation @Configuration
   - @Configuration: cho biết class đó chứa info cấu hình app.
   - Spring Boot tìm class @Configuration để tạo và quản lý bean.
   - @Bean: Cho biết method tạo và trả về một bean.

Bean Scope
+ Singleton: container chỉ khởi tạo 1 instance của bean và trả về chính nó nếu như có nhu cầu.
+ Prototype: Mỗi khi có yêu cầu thì container sẽ tạo ra một instance mới và trả về.
+ .....
VD: Cách dùng @Scope("singleton")

![Logo](C:\Users\nguye\OneDrive\Hình ảnh\Ảnh chụp màn hình\Screenshot 2024-07-21 235807.png)
