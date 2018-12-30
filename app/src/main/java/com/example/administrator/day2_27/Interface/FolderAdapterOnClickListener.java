package com.example.administrator.day2_27.Interface;

import java.io.File;

public interface FolderAdapterOnClickListener {
    void insideStorage(File file);

    void externalStorage();

    void normalClick(File file);
}
