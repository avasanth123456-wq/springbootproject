package Labour.service;

import Labour.dto.LabourRequestDTO;
import Labour.dto.LabourResponseDTO;

import java.util.List;

public interface LabourService {

    LabourResponseDTO registerLabour(
            LabourRequestDTO requestDTO);

    List<LabourResponseDTO> getAllLabours();
}
