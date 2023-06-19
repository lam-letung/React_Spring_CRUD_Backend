USE [FULLSTACK_DATABASE]
GO
/****** Object:  Table [dbo].[tbl_user]    Script Date: 19/06/2023 4:41:54 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_user](
	[id] [bigint] NOT NULL,
	[emaii] [varchar](255) NULL,
	[name] [varchar](255) NULL,
	[username] [varchar](255) NULL,
	[email] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[tbl_user] ([id], [emaii], [name], [username], [email]) VALUES (6, NULL, N'quy', N'quyov', N'1uy@gmail')
INSERT [dbo].[tbl_user] ([id], [emaii], [name], [username], [email]) VALUES (7, NULL, N'21312312', N'lam', N'ádasd')
INSERT [dbo].[tbl_user] ([id], [emaii], [name], [username], [email]) VALUES (10, NULL, N'Sports', N'admin', N'manhle0107@gmail.com')
GO
