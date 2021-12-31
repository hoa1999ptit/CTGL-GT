# CTGL-GT-PTIT
 Cấu trúc dữ liệu và giải thuật PTIT C++/JAVA
# Ôn tập các thuật toán
### DSLK đơn 
1. Giới thiệu: Danh sách liên kết đơn là một tập hợp các Node được phân bố động, được sắp xếp theo cách sao cho mỗi Node chứa “một giá trị”(Data) và “một con trỏ”(Next).     Con trỏ sẽ trỏ đến phần tử kế tiếp của danh sách liên kết đó. Nếu con trỏ mà trỏ tới NULL, nghĩa là đó là phần tử cuối cùng của linked list.
	+	Được cấp phát bộ nhớ khi chạy chương trình
	+	Có thể thay đổi kích thước qua việc thêm, xóa phần tử
	+	Kích thước tối đa phụ thuộc vào bộ nhớ khả dụng của RAM
	+	Các phần tử được lưu trữ ngẫu nhiên (không liên tiếp) trong RAM
2. Và do tính liên kết của phần tử đầu và phần tử đứng sau nó trong danh sách liên kết đơn, nó có các đặc điểm sau:
	+	Chỉ cần nắm được phần tử đầu và cuối là có thể quản lý được danh sách
	+	Truy cập tới phần tử ngẫu nhiên phải duyệt từ đầu đến vị trí đó
	+	Chỉ có thể tìm kiếm tuyến tính một phần tử
### Quay Lui
1. Giới thiệu: 
-	Quay lui là một kĩ thuật thiết kế giải thuật dựa trên đệ quy. Ý tưởng của quay lui là tìm lời giải từng bước, mỗi bước chọn một trong số các lựa chọn khả dĩ   và đệ quy. Người đầu tiên đề ra thuật ngữ này (backtrack) là nhà toán học người Mỹ D. H. Lehmer vào những năm 1950.
2. Các bước trong việc liệt kê cấu hình dạng X[1...n]:
	+	Xét tất cả các giá trị X[1] có thể nhận, thử X[1] nhận các giá trị đó. Với mỗi giá trị của X[1] ta sẽ:
	+	Xét tất cả giá trị X[2] có thể nhận, lại thử X[2] cho các giá trị đó. Với mỗi giá trị X[2] lại xét khả năng giá trị của X[3]...tiếp tục như vậy cho tới bước:
					...
					....
	+	Xét tất cả giá trị X[n] có thể nhận, thử cho X[n] nhận lần lượt giá trị đó.
	+	Thông báo cấu hình tìm được.
	+	Bản chất của quay lui là một quá trình tìm kiếm theo chiều sâu(Depth-First Search).
3. Mô hình thuật toán

			Backtracking(k) {
				for([Mỗi phương án chọn i(thuộc tập D)]) {
					if ([Chấp nhận i]) {
						[Chọn i cho X[k]];
						if ([Thành công]) {
							[Đưa ra kết quả];
						} else {
							Backtracking(k+1);
							[Bỏ chọn i cho X[k]];
						}
					}
				}
			}
			
4. Nhận xét
-	Ưu điểm:Việc quay lui là thử tất cả các tổ hợp để tìm được một lời giải. Thế mạnh của phương pháp này là nhiều cài đặt tránh được việc phải thử nhiều trường hợp chưa hoàn chỉnh, nhờ đó giảm thời gian chạy.
-	Nhược điểm:Trong trường hợp xấu nhất độ phức tạp của quay lui vẫn là cấp số mũ. Vì nó mắc phải các nhược điểm sau:
	+	Rơi vào tình trạng "thrashing": qúa trình tìm kiếm cứ gặp phải bế tắc với cùng một nguyên nhân.
	+	Thực hiện các công việc dư thừa: Mỗi lần chúng ta quay lui, chúng ta cần phải đánh giá lại lời giải trong khi đôi lúc điều đó không cần thiết.
	+	Không sớm phát hiện được các khả năng bị bế tắc trong tương lai. Quay lui chuẩn, không có cơ chế nhìn về tương lai để nhận biết đc nhánh tìm kiếm sẽ đi vào bế tắc.
### Quy hoạch động
1. Giới thiệu
-	QHĐ là kĩ thuật được được dùng khi có một công thức và một (hoặc một vài) trạng thái bắt đầu. Một bài toán được tính bởi các bài toán nhỏ hơn đã tìm ra trước đó. QHĐ có độ phức tạp đa thức nên sẽ chạy nhanh hơn quay lui và duyệt trâu.
3. Thuật toán
4. Nhận xét
# Danh sách các bài tập contest PTIT
    1. DSLK đơn
    2. Sinh kế tiếp
    3. Quay lui - Nhánh cận
    4. Giải thuật tham lam
    5. Chia để trị
    6. Quy hoạch động
    7. Sắp xếp - Tìm kiếm
    8. Ngăn Xếp - Hàng đợi
    9. Đồ thị
    10. Cây nhị phân
