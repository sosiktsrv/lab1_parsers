package org.example.parser;

import org.example.exception.InvalidMissionFormatException;
import org.example.model.Mission;
import java.io.File;

public interface MissionParser {
    Mission parse(File file) throws InvalidMissionFormatException;
    boolean supportsFormat(File file);
}
