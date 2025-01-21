CREATE DATABASE EduSys;

USE EduSys;

CREATE TABLE NhanVien (
	MaNV NVARCHAR(50) NOT NULL,
	MatKhau NVARCHAR(50) NOT NULL,
	HoTen NVARCHAR(50) NOT NULL,
	VaiTro BIT NOT NULL,
	PRIMARY KEY (MaNV)
)

CREATE TABLE ChuyenDe (
	MaCD NCHAR(5) NOT NULL,
	TenCD NVARCHAR(50) NOT NULL,
	HocPhi FLOAT NOT NULL,
	ThoiLuong INT NOT NULL,
	Hinh NVARCHAR(50) NOT NULL,
	MoTa NVARCHAR(255) NOT NULL,
	PRIMARY KEY(MACD)
)

CREATE TABLE KhoaHoc (
	MaKH INT IDENTITY(1,1) NOT NULL,
	MaCD NCHAR (5) NOT NULL,
	HocPhi FLOAT NOT NULL,
	ThoiLuong INT NOT NULL,
	NgayKG DATE NOT NULL,
	GhiChu NVARCHAR(50) NULL,
	MaNV NVARCHAR(50) NOT NULL,
	NgayTao DATE NOT NULL,
	PRIMARY KEY(MaKH),
	FOREIGN KEY (MaCD) REFERENCES ChuyenDe (MaCD) ON DELETE NO ACTION ON UPDATE CASCADE,
	FOREIGN KEY (MaNV) REFERENCES NhanVien (MaNV) ON DELETE NO ACTION ON UPDATE CASCADE
)

CREATE TABLE NguoiHoc (
	MANH NCHAR (7) NOT NULL,
	HoTen NVARCHAR(50) NOT NULL,
	NgaySinh DATE NOT NULL,
	GioiTinh BIT NOT NULL,
	DienThoai NVARCHAR(50) NOT NULL,
	Email NVARCHAR(50) NOT NULL,
	GhiChu NVARCHAR (max) NULL,
	MaNV NVARCHAR(50) NOT NULL,
	NgayDK DATE NOT NULL,
	PRIMARY KEY (MaNH),
	FOREIGN KEY (MaNV) REFERENCES NhanVien (MaNV) ON DELETE NO ACTION ON UPDATE CASCADE
)

CREATE TABLE HocVien (
    MaHV INT IDENTITY(1,1) NOT NULL,
    MaKH INT NOT NULL,
    MaNH NCHAR(7) NOT NULL,
    Diem FLOAT NOT NULL,
    PRIMARY KEY (MaHV),
    FOREIGN KEY (MaNH) REFERENCES NguoiHoc (MaNH),
    FOREIGN KEY (MaKH) REFERENCES KhoaHoc (MaKH)
)

-- Thêm dữ liệu vào bảng NhanVien
INSERT INTO NhanVien (MaNV, MatKhau, HoTen, VaiTro)
VALUES ('NV001', '123456', N'Nguyễn Văn A', 1);

-- Thêm dữ liệu vào bảng ChuyenDe
INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa)
VALUES ('CD001', N'Lập trình Java', 5000000, 60, N'java.png', N'Khóa học lập trình Java cơ bản');

-- Thêm dữ liệu vào bảng KhoaHoc
INSERT INTO KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao)
VALUES ('CD001', 5000000, 60, '2025-02-01', N'Khóa học khai giảng tháng 2', 'NV001', '2025-01-15');

-- Thêm dữ liệu vào bảng NguoiHoc
INSERT INTO NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV, NgayDK)
VALUES ('NH0001', N'Trần Thị B', '2000-05-20', 0, '0123456789', 'tranb@example.com', N'Sinh viên chăm chỉ', 'NV001', '2025-01-15');

-- Thêm dữ liệu vào bảng HocVien
INSERT INTO HocVien (MaKH, MaNH, Diem)
VALUES (1, 'NH0001', 8.5);
